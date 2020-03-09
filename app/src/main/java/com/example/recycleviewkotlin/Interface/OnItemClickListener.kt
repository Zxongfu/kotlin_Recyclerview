package com.example.recycleviewkotlin.Interface

import com.example.recycleviewkotlin.models.Hobby

interface OnItemClickListener {
    fun onItemClick(hobby: Hobby?)
    fun shareItemClick(hobby: Hobby?)
}