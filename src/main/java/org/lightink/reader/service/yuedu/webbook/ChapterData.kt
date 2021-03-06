package io.legado.app.model.webbook

import io.legado.app.data.entities.BookChapter

data class ChapterData<T>(
    var chapterList: List<BookChapter>? = null,
    var nextUrl: T
)