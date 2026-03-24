package com.mohamed.mystore.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.mystore.R
import com.mohamed.mystore.componentes.ItemClothes
import com.mohamed.mystore.componentes.ItemArrival

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    data class Category(val name: String, val img: Int)
    val categories = listOf(
        Category("Men" , R.drawable.man),
        Category("Women" , R.drawable.women),
        Category("Shoes", R.drawable.shoes),
        Category("Accessories" , R.drawable.hat)
    )
    data class Arrival(val img: Int, val name: String, val price: String)
    val arrivals = listOf(
        Arrival(R.drawable.shirt, "Tee_Sht" , "$20"),
        Arrival(R.drawable.pag, "Tote_Pag" , "$35"),
        Arrival(R.drawable.white_shoes, "White", "$50"),
        Arrival(R.drawable.black, "Black" , "$40"),
        Arrival(R.drawable.casual_style , "Casual", "$150")
    )

    Scaffold (
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets.safeDrawing,
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                modifier = Modifier
                    .padding(24.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription = "",
                        modifier = Modifier.size(32.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.favorite_border_24),
                        contentDescription = "",
                        modifier = Modifier.size(32.dp)

                    )
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = "",
                        modifier = Modifier.size(32.dp)

                    )
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }
    ){  innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = innerPadding.calculateTopPadding())
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Home",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W600
                )
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.offer ),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                  .padding(horizontal = 24.dp)
            )
            Column (
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 24.dp)
            ){
                Text(
                    "Categories",
                    fontWeight = FontWeight.W600,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(start = 24.dp)
                )
                Spacer(Modifier.height(16.dp))
                LazyRow (
                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    item {
                        Spacer(Modifier.width(24.dp))
                    }
                    items(categories) { category ->
                        ItemClothes(
                            category.name,
                            category.img,
                            modifier = Modifier
                                .padding(end = 24.dp)
                        )
                    }
                }
            }
            Column (
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    "New Arrivals",
                    fontWeight = FontWeight.W600,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(start = 24.dp)
                )
                Spacer(Modifier.height(8.dp))
                LazyRow (
                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    item {
                        Spacer(Modifier.width(24.dp))
                    }
                    items(arrivals) { arrival ->
                        ItemArrival(
                            arrival.img,
                            arrival.name,
                            arrival.price,
                            modifier = Modifier
                                .padding(end = 8.dp)
                        )
                    }
                    item {
                        Spacer(Modifier.width(24.dp))
                    }
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun PreviewHome() {
    HomeScreen()
}