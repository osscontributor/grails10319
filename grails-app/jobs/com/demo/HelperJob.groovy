package com.demo



class HelperJob {
    def demoService

    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        def widget = demoService.createWidget([name: 'Some Widget'])

        println "Widget name: ${widget.name}"
    }
}
