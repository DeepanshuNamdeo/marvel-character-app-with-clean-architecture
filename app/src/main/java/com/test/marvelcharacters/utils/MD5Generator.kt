package com.test.marvelcharacters.utils
import java.math.BigInteger
import java.security.MessageDigest
import java.security.Timestamp

class ApiKeyProvider() {
    private val privateKey : String = "219c56cf9255a1014da1459d7f4ff0e464277041"
    private val publicKey : String = "e93c1fd403820117d2c613940d83c5fb"

    fun md5(timestamp: Timestamp): String {
        val input = timestamp.toString()+privateKey+publicKey
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }
}