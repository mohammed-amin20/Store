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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun ItemClothes(
    name : String,
    img: Int,
    modifier: Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.size(65.dp)
                .clip(CircleShape)
                .background(color = Color(0xFFECEDE8))
                .padding(10.dp)
        ){
            Image(
                modifier = Modifier.fillMaxSize()
                    .padding(4.dp),
                painter = painterResource(id = img) ,
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(12.dp))
        Text(name , fontSize = 14.sp, fontWeight = FontWeight.W500)
    }
}
