package com.demo

import org.grails.databinding.SimpleMapDataBindingSource

class DemoService {

    def grailsWebDataBinder

    def createWidget(Map props) {
        def widget = new Widget()
        grailsWebDataBinder.bind widget, new SimpleMapDataBindingSource(props)
        widget
    }
}
