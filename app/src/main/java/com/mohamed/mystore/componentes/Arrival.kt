package com.mohamed.mystore.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemArrival(img : Int , name: String , price : String, modifier: Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
    ){
        Box(
            modifier = Modifier.size(90.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(color = Color(0xFFECEDE8))
                .padding(4.dp)
        ){
            Image(
                modifier = Modifier.fillMaxSize()
//                    .padding(2.dp)
               , painter = painterResource(id = img) ,
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(4.dp))
        Text(name , fontSize = 14.sp, fontWeight = FontWeight.W500)
//        Spacer(Modifier.height(4.dp))
        Text(price , fontSize = 16.sp, fontWeight = FontWeight.W500)
    }
}