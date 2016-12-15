package com.enrol

class Course {

String title
String department
String leader
String code
Date startDate
Date endDate
String description
String studyMode
int numberOfStudents
double tuitionFees

    static constraints = {

	title blank:false, nullable:false
	department blank:false, nullable:false
	leader blank:false, nullable:false
	code blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, min:20, max:60
	startDate blank:false, nullable:false
	endDate blank:false, nullable:false
	studyMode blank:false, nullable:false, size:1..20
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	tuitionFees blank:false, nullable:false,  scale:2
    }
}
