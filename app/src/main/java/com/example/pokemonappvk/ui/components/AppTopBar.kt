package com.example.pokemonappvk.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    hasBackBtn: Boolean = false,
    onBackBtnClicked: (() -> Unit)? = null
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Pokemon list",
                fontSize = 24.sp,
            )
//            if (title == "Pokemon"){
//                Text(
//                    text = "Pokemon list",
//                    fontSize = 24.sp,
//                )
//            }else {
//                Text(
//                    text = title,
//                    fontSize = 24.sp,
//                )
//            }
        },
        navigationIcon = {
            if (hasBackBtn) {
                IconButton(onClick = { onBackBtnClicked?.invoke() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,

                        contentDescription = "back"
                    )
                }
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Transparent
        ),
        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    )
}