package com.example.composequadrant

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun Solution(){
    Column (Modifier.fillMaxWidth()){
        Row (Modifier.weight(1f)){
            EDGEGHERWH(
                backcolor = Color(0xFFEADDFF),
                message = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                title = stringResource(R.string.text_composable),
                modifier = Modifier.weight(1f)
            )
            EDGEGHERWH(
                backcolor = Color(0xFFD0BCFF),
                message = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                title = stringResource(R.string.image_composable),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            EDGEGHERWH(
                backcolor = Color(0xFFB69DF8),
                message = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                title = stringResource(R.string.row_composable),
                modifier = Modifier.weight(1f)
            )
            EDGEGHERWH(
                backcolor = Color(0xFFF6EDFF),
                message = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                title = stringResource(R.string.column_composable),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun EDGEGHERWH(
    backcolor: Color,
    message: String,
    title: String,
    modifier: Modifier = Modifier
){


    Column (
        modifier
            .fillMaxSize()
            .background(backcolor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = message,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Solution()
    }
}
