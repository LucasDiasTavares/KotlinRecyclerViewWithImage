package br.com.lucasdiastavares.recylerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.lucasdiastavares.recylerview.Model.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var postAdapter: RecylerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        postAdapter.submitList(data)
    }

    private fun init(){
        /*method 1
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            postAdapter = RecylerViewAdapter(this@MainActivity)
            adapter = postAdapter
        }*/

        /*method 2 */
        recycler_view.layoutManager = LinearLayoutManager(this)
        postAdapter = RecylerViewAdapter(this)
        recycler_view.adapter = postAdapter
    }

}
