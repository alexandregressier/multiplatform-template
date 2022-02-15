package me.replace.replaceme

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}