package com.android.hindishayariyaan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.hindishayariyaan.data.Datasource
import com.android.hindishayariyaan.model.HindiShayari
import com.android.hindishayariyaan.ui.theme.HindiShayariyaanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HindiShayariyaanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Hindi()
                }
            }
        }
    }
}
@Composable
fun HindiShayariList(quotesList: List<HindiShayari>, modifier: Modifier = Modifier){
   LazyColumn(modifier = modifier){
       items(quotesList){
           Hindi(
               quotes = it,
               modifier = Modifier.padding(8.dp)
           )

       }
   }
}

@Composable
fun Hindi(){
    HindiShayariList(
        quotesList =Datasource().loadHindiQuotes()
    )
}
@Composable
fun Hindi(quotes: HindiShayari, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(quotes.imageResourceId),
                contentDescription = stringResource(quotes.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(quotes.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HindiShayariPreview() {
        Hindi(HindiShayari(R.string.quote1, R.drawable.image1))
}