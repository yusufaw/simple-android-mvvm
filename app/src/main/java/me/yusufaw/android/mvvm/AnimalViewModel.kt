package me.yusufaw.android.mvvm

import me.yusufaw.android.mvvm.data.Animal

class AnimalViewModel(val animal: Animal){
    var info= "${animal.name} barked ${animal.shoutCount} times.."
    fun shout(){
        animal.shoutCount++
        info="${animal.name} barked ${animal.shoutCount} times.."
    }
}