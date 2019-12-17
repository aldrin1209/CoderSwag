package com.aldrin.coderswag.Services

import com.aldrin.coderswag.Model.Category
import com.aldrin.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat Blue", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$32", "hoodie02"),
        Product("Devslopes Hoodie Black", "$20", "hoodie03"),
        Product("Devslopes Hoodie Blue", "$21", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt01"),
        Product("Devslopes Shirt Red", "$22", "shirt02"),
        Product("Devslopes Shirt Black", "$10", "shirt03"),
        Product("Devslopes Shirt Pink", "$11", "shirt04"),
        Product("Kickflip Studios", "$13", "shirt05")
    )
}