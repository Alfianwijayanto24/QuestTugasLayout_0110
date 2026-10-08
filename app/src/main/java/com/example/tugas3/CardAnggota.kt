package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardAnggota(
    nama: Int,
    nim: Int?,
    alamat: Int,
    warna: Int,
    miring: Boolean = false
)
{

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 6.dp,
                bottom = 6.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(
                id = warna
            )
        )
    )
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 10.dp,
                    vertical = 8.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){

            // LOGO KIRI
            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
            )// DATA ANGGOTA
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        horizontal = 40.dp
                    )
            )
            {

                Text(
                    text = stringResource(
                        id = nama
                    ),
                    fontSize = 30.sp,
                    fontWeight = if (miring) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    },
                    fontStyle = if (miring) {
                        FontStyle.Italic
                    } else {
                        FontStyle.Normal
                    },
                    color = colorResource(
                        id = R.color.white
                    )
                )
                if (nim != null) {

                    Spacer(
                        modifier = Modifier.size(2.dp)
                    )

                    Text(
                        text = stringResource(
                            id = nim
                        ),
                        fontSize = 14.sp,
                        color = colorResource(
                            id = R.color.cyan
                        )
                    )
                }
                Spacer(
                    modifier = Modifier.size(2.dp)
                )

                Text(
                    text = stringResource(
                        id = alamat
                    ),
                    fontSize = 20.sp,
                    color = colorResource(
                        id = R.color.yellow
                    )
                )
            }
            // LOGO KANAN
            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
            )
        }
    }

}







