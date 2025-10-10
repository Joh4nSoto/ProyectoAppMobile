package com.example.practica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.practica.ui.theme.Formulario
import com.example.practica.ui.theme.PracticaTheme
import com.example.practica.viewmodel.FormularioViewModel

class MainActivity : ComponentActivity() {

    private val viewModel = FormularioViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticaTheme { // <- aquí va el nombre de TU TEMA, lo puedes encontrar en ui/theme/Theme.kt
                Formulario(viewModel)
                //BotonCargando()
                //TextoInvertido()
                //Persistencia()
                //UsuarioFormScreen()
                //Modal()
                // Formulario()
                //Login()
                //Navegacion()
                //CamaraFotos()
                //ModalScreen()
                //GPS()
                //AgregarUsuarios()
                // TocarPantalla()
            }
        }
    }



}
