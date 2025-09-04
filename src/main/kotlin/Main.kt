package com.example.cql2elm

import org.cqframework.cql.cql2elm.CqlTranslator
import org.cqframework.cql.cql2elm.LibraryManager
import org.cqframework.cql.cql2elm.ModelManager

fun main() {
    val cql = """
        library Test version '1.0.0'
        using FHIR version '4.0.1'
        include FHIRHelpers version '4.0.1' called FHIRHelpers
        context Patient
        define InInitialPopulation: true
        define quantity: 5 'mg/dL'
    """.trimIndent()

    val modelManager = ModelManager()
    val libraryManager = LibraryManager(modelManager)
    val translator = CqlTranslator.fromText(cql, libraryManager)
    println(translator.toXml())
}
