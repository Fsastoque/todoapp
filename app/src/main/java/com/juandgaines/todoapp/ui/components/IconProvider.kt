package com.juandgaines.todoapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class IconProvider: PreviewParameterProvider<IconContainer> {
    override val values: Sequence<IconContainer>
        get() = sequenceOf(
            IconContainer(Icons.Default.Add),
            IconContainer(Icons.Default.MoreVert),
            IconContainer(Icons.Default.Call),
            IconContainer(Icons.Default.Star),
            IconContainer(Icons.Default.Search),
            IconContainer(Icons.Default.AccountBox),
            IconContainer(Icons.Default.Build),
            IconContainer(Icons.Default.Face)
        )
}