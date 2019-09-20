package br.com.takizera.appjogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Função para  verificar o botão selecionado, como também guardar o endereço do botão
    fun btClick(view: View){
        //verifica qual botão foi selecionado
        val btSelecionado = view as Button


        //guarda o endereço do button
        var cellID = 0

        when(btSelecionado.id){
            R.id.btn1 -> cellID = 1
            R.id.btn2 -> cellID = 2
            R.id.btn3 -> cellID = 3
            R.id.btn4 -> cellID = 4
            R.id.btn5 -> cellID = 5
            R.id.btn6 -> cellID = 6
            R.id.btn7 -> cellID = 7
            R.id.btn8 -> cellID = 8
            R.id.btn9 -> cellID = 9
        }
        //Toast.makeText(this, "ID: "+cellID, Toast.LENGTH_SHORT).show()
        playGame(cellID, btSelecionado)
    }

    //Arrays para guardar as jogadas de cada jogador

    var jogadorUm = ArrayList<Int>()
    var jogadrDois = ArrayList<Int>()

    //Ordem de jogada

    var activeplayer = 1


    //pq o parâmetro btSelecionado: Para marcar visualmente na nossa activity
    fun playGame(cellID:Int, btSelecionado:Button){
        if (activeplayer == 1){
            btSelecionado.text = "X"
            btSelecionado.setBackgroundColor(Color.GREEN)
            jogadorUm.add(cellID)
            activeplayer = 2
        }else{
            btSelecionado.text = "O"
            btSelecionado.setBackgroundColor(Color.MAGENTA)
            jogadrDois.add(cellID)
            activeplayer = 1
        }

        //Tratando a ocorrência de não selecionar o mesmo campo mais de uma vez
        btSelecionado.isEnabled = false
    }


}
