package com.vegasega.jetpacktest1

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.vegasega.jetpacktest1.ui.theme.JetpackTest1Theme
import ir.kaaveh.sdpcompose.sdp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            JetpackTest1Theme {
                Scaffold(
                    bottomBar = {
//                        AnimatedVisibility(
//                            visible = appState.shouldShowBottomBar,
//                            enter = BottomBarEnterTransition,
//                            exit = BottomBarExitTransition
//                        ){
//                            BottomAppBar { MovieVistaBottomBar(
//                                destinations = appState.topLevelDestinations,
//                                currentDestination = appState.currentTopLevelDestination,
//                                onNavigateToDestination = appState::navigate
//                            ) }
//                        }
                    },
                    snackbarHost = {
//                        MovieVistaSnackbarHost(
//                            modifier = Modifier.windowInsetsPadding(
//                                if (appState.shouldShowBottomBar) {
//                                    WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)
//                                } else {
//                                    WindowInsets.safeDrawing
//                                }
//                            ),
//                            snackbarHostState = appState.snackbarHostState
//                        )
                    },
                    contentWindowInsets = WindowInsets(
                        left = 0.dp,
                        top = 0.dp,
                        right = 0.dp,
                        bottom = 0.dp
                    )
                ) { innerPadding ->
//            NavigationScreens(navController = navController)
//                    MovieVistaNavHost(
//                        modifier = Modifier
//                            .padding(paddingValues = innerPadding)
//                            .consumeWindowInsets(paddingValues = innerPadding),
//                        navController = appState.navController,
//                        startDestination = SplashDestination,
//                        onNavigateToDestination = appState::navigate,
//                        onBackClick = appState::onBackClick,
//                        onShowMessage = { message -> appState.showMessage(message) },
//                    )


                    Box(modifier = Modifier
                        .padding(paddingValues = innerPadding)
                        .consumeWindowInsets(paddingValues = innerPadding)){
                        Login()
                    }
                }
            }
        }
    }
}




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Login(
) {
    Scaffold(
        bottomBar = {},
        topBar = {}
    ){

        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

//        Text("Testing", fontSize = resources.getDimension(R.dimen.test).sp)

//        Text("Testing", fontSize = dimensionResource(androidx.core.splashscreen.R.dimen.splashscreen_icon_size).value.sp)

        Column {
            Text("Hello World", fontSize = 20.sp)

            Text(text = "Hello World", fontSize = 20.sdp.value.sp)
        }




//        Box(
//        modifier = Modifier
//            .fillMaxSize()
//    ){
//
//        Image(painter = painterResource(id = R.drawable.splash_bg),
//            contentDescription = "splash_bg",
//            modifier = Modifier
//                .fillMaxSize()
//                .blur(6.dp),
//            contentScale = ContentScale.FillBounds
//        )
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
////                .padding(16.dp)
//                .alpha(0.6f)
//                .clip(
//                    CutCornerShape(
//                        topStart = 8.dp,
//                        topEnd = 16.dp,
//                        bottomStart = 16.dp,
//                        bottomEnd = 8.dp
//                    )
//                )
//                .background(MaterialTheme.colors.background),
//
//            ){
//
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(28.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceAround
//            ) {
//                LoginHeader()
//
//
////                Spacer(modifier = Modifier.height(120.dp))
//
//                LoginField(
//                    username, password,
//                    onUsernameChange = { username = it },
//                    onPasswordChange = { password = it },
//                    onForgotPasswordClick = {
//
//                    }
//                )
//
//
//                LoginFooter(
//                    onSignInClick = {},
//                    onSignUpClick = {}
//                )
//            }
//        }
//
//
//    }


    }

}






//@Preview(name = "phone", device = "spec:shape=Normal,width=1440,height=2560,unit=dp,dpi=560")
//@Preview(name = "phone", device = "spec:shape=Normal,width=200,height=320,unit=dp,dpi=120")
//@Preview(name = "phone", device = "spec:shape=Normal,width=320,height=480,unit=dp,dpi=160")
//@Preview(name = "phone", device = "spec:shape=Normal,width=480,height=800,unit=dp,dpi=240")
//@Preview(name = "phone", device = "spec:shape=Normal,width=720,height=1280,unit=dp,dpi=320")
//@Preview(name = "phone", device = "spec:shape=Normal,width=960,height=1600,unit=dp,dpi=480")
//@Preview(name = "phone", device = "spec:shape=Normal,width=1280,height=1920,unit=dp,dpi=640")
//@Preview(name = "phone", device = "spec:shape=Normal,width=1080,height=2400,unit=dp,dpi=407")
//@Preview(name = "phone", device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480")
@Preview(name = "NEXUS_7", device = Devices.DEFAULT)
//@Preview(name = "NEXUS_7", device = Devices.NEXUS_7)
//@Preview(name = "NEXUS_7_2013", device = Devices.NEXUS_7_2013)
//@Preview(name = "NEXUS_5", device = Devices.NEXUS_5)
//@Preview(name = "NEXUS_6", device = Devices.NEXUS_6)
////@Preview(name = "NEXUS_9", device = Devices.NEXUS_9)
////@Preview(name = "NEXUS_10", device = Devices.NEXUS_10)
//@Preview(name = "NEXUS_5X", device = Devices.NEXUS_5X)
//@Preview(name = "NEXUS_6P", device = Devices.NEXUS_6P)
////@Preview(name = "PIXEL_C", device = Devices.PIXEL_C)
//@Preview(name = "PIXEL", device = Devices.PIXEL)
//@Preview(name = "PIXEL_XL", device = Devices.PIXEL_XL)
//@Preview(name = "PIXEL_2", device = Devices.PIXEL_2)
//@Preview(name = "PIXEL_2_XL", device = Devices.PIXEL_2_XL)
//@Preview(name = "PIXEL_3", device = Devices.PIXEL_3)
//@Preview(name = "PIXEL_3_XL", device = Devices.PIXEL_3_XL)
//@Preview(name = "PIXEL_3A", device = Devices.PIXEL_3A)
//@Preview(name = "PIXEL_3A_XL", device = Devices.PIXEL_3A_XL)
//@Preview(name = "PIXEL_4", device = Devices.PIXEL_4)
//@Preview(name = "PIXEL_4_XL", device = Devices.PIXEL_4_XL)
//@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginPreview() {
//    LoginScreen(
//        onRegister = {}
//    )

    Login()
}