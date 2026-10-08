package com.example.tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Tugas3Theme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    ActivitasPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ActivitasPertama(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {

        // BACKGROUND
        Image(
            painter = painterResource(
                id = R.drawable.background
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // ISI HALAMAN
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 12.dp,
                    end = 12.dp,
                    top = 70.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            // JUDUL
            Text(
                text = stringResource(
                    id = R.string.prodi
                ),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(
                    id = R.color.black
                )
            )

            // UNIVERSITAS
            Text(
                text = stringResource(
                    id = R.string.univ
                ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(
                    id = R.color.black
                )
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )
            // CARD 1
            CardAnggota(
                nama = R.string.nama_1,
                nim = null,
                alamat = R.string.alamat_1,
                warna = R.color.card_0_bg,
                miring = true
            )

            // CARD 2
            CardAnggota(
                nama = R.string.nama_2,
                nim = R.string.nim_2,
                alamat = R.string.alamat_2,
                warna = R.color.card_1_bg
            )

            // CARD 3
            CardAnggota(
                nama = R.string.nama_3,
                nim = R.string.nim_3,
                alamat = R.string.alamat_3,
                warna = R.color.card_2_bg
            )

            // CARD 4
            CardAnggota(
                nama = R.string.nama_4,
                nim = R.string.nim_4,
                alamat = R.string.alamat_4,
                warna = R.color.card_3_bg
            )
        }
        // COPYRIGHT
        Text(
            text = stringResource(
                id = R.string.copy
            ),
            fontSize = 12.sp,
            color = colorResource(
                id = R.color.black
            ),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(
                    bottom = 8.dp
                )
        )
    }
}







