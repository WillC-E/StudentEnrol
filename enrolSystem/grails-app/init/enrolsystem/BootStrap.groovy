package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing = new Course(

		title:'BSc Hon Computing',
		code:'COMP234',
		leader:'DrMP',
		department:'Computing',
		startDate:new Date('11/11/2016'),
		endDate:new Date('11/11/2020'),
		numberOfStudents:45,
		description:'''a good course''',
		tuitionFees:900,
		studyMode:'fullTime'
		).save()
    }
    def destroy = {
    }
}
