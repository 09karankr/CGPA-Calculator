package com.example.cgpacalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cgpacalculator.ui.theme.CGPACalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CGPACalculatorTheme {
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
@Composable
fun CGPA(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "CGPA Calculator\nYour marks ,Your Future",
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                color = Color(0xFF000000)
            ))
        Spacer(modifier = Modifier.padding(top = 10.dp))
        SubjectText(subject ="Subject 1")


    }
}

@Composable
fun SubjectText(subject: String){
    Text(
        text = subject,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontSize = 16.sp,
            //textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.poppins_medium)),
            color = Color(0xFF000000)
        ))
}

@Composable
fun GradeTextField(
    grade:String,
    onValueChange: (String)->Unit
    ){
    TextField(
        value = grade ,
        onValueChange = {text ->
            onValueChange(text)

        }
    )
}



@Preview(showBackground = true)
@Composable
fun CGPAPreview(){
    CGPACalculatorTheme {
        CGPA()
    }
}