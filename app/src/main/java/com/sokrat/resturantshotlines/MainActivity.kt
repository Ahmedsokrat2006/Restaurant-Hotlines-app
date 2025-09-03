package com.sokrat.resturantshotlines


import android.content.res.Configuration
import android.icu.lang.UCharacter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val restaurants = arrayListOf<Restaurant>(
        Restaurant(R.drawable.b_laban, getString(R.string.b_laban),"15761"),
        Restaurant(R.drawable.konafa_w_basbousa,getString(R.string.kunafa_basbousa),"15736"),
        Restaurant(R.drawable.wahmy, getString(R.string.wahmy_burger),"19905"),
        Restaurant(R.drawable.buffalo_burger, getString( R.string.buffalo_burger),"19914"),
        Restaurant(R.drawable.mac, getString(R.string.mcdonalds),"19991"),
        Restaurant(R.drawable.karam_elsham, getString(R.string.karam_el_sham),"19509"),
        Restaurant(R.drawable.baheeg, getString(R.string.baheeg),"+201203111170"),
        Restaurant(R.drawable.kansas, getString(R.string.kansas),"16213"),
        Restaurant(R.drawable.bazooka, getString(R.string.bazooka),"16455"),
        Restaurant(R.drawable.kfc, getString(R.string.kfc),"19019"),
        Restaurant(R.drawable.city_crepe, getString(R.string.city_crepe),"15977"),
        Restaurant(R.drawable.dominos_pizza, getString(R.string.domino_s_pizza),"19223"),
        Restaurant(R.drawable.pizza_hut, getString(R.string.pizza_hut),"19000"),
        Restaurant(R.drawable.abo_tarek, getString(R.string.abou_tarek_koshary),"16011"),
        Restaurant(R.drawable.koshary_eltahreer, getString(R.string.koshary_al_tahrir),"19719")
        )

        val adapter = RestaurantAdapter(this,restaurants)
        val rv : RecyclerView = findViewById(R.id.rv)
        if(setLayoutManager(resources.configuration.orientation) == 1){
            rv.layoutManager = LinearLayoutManager(this)
        }
        else if(setLayoutManager(resources.configuration.orientation) == 2){
            rv.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        }
        rv.adapter = adapter
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        setLayoutManager(newConfig.orientation)
    }

    private fun setLayoutManager(orientation : Int) : Int{
        if(orientation == Configuration.ORIENTATION_PORTRAIT) {return 1}
        else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {return 2}
        return 0
    }

    override fun onBackPressed() {
        val exit = ExitDialog()
        exit.show(supportFragmentManager, null)
    }
}