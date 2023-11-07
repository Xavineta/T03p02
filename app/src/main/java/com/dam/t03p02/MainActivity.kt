package com.dam.t03p02

import android.os.Build
import android.os.Bundle
import android.os.ext.SdkExtensions
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.t03p02.ui.theme.DataSource
import com.dam.t03p02.ui.theme.T03p02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            T03p02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@RequiresExtension(extension = Build.VERSION_CODES.R, version = 4)
@RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
@Composable
private fun BuildAGrid(
    modifier: Modifier,
    tituloFotografia: String,
    descripcionFotografia:String,
    segundaImagen:Painter,
    numero:Int
) {
LazyHorizontalGrid(rows = GridCells.Adaptive(10.dp), content = {
    items(DataSource.topics) {item->
        Card(modifier=Modifier.fillMaxSize()) {
            Column {
                Image(painter = painterResource(id = item.topicId) , contentDescription =
                ) )
            }
             Row {
                 Image(painter = painterResource(R.drawable.ic_grain), contentDescription =descripcionFotografia)
                 Text(text = numero.toString())
             }
        }
    }
} )
}

@RequiresExtension(extension = Build.VERSION_CODES.R, version = 4)
@RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    T03p02Theme {
        BuildAGrid(modifier = Modifier, tituloFotografia = "Prueba", imagen = painterResource(R.drawable.architecture),
            descripcionFotografia = "patata",
            segundaImagen = painterResource(R.drawable.ic_grain), numero = 1)
    }
}