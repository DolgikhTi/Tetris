package com.example.tetris.tihelper

fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray> = Array(sizeOuter) {
    ByteArray(sizeInner)
}