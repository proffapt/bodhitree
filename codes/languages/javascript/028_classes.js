// Classes are blueprint for designing objects.
/*
	Different objects which have something in common can be created from class.
	Where class has those common things and we can build our objects on top of it.
*/
// To create a class:
class RailwayForm{
	/*
		What does JS expect here?
		Consructor, Method, Property or accessor
	*/
	fill(givenname, trainno){
		this.name=givenname
		this.trainno=trainno
	//      ^ this whole name is what matters
		/*
			`this` is the reference to the current object used to call the function

			`name` is comming from the argument to this method
				- It is scoped to this function only
			`this.name` is the name which is a property for objects of this class
				- It is scoped to this whole class. Any method or stuff in this class 
				can access it.
		*/
	}
	submit(){
		console.log(this.name+", Form submitted... for train no : "+this.trainno)
	}
	cancel(){
		console.log(this.name+", Form cancelled... for trian no : "+this.trainno)
	}
}

// To create objects
let proffForm = new RailwayForm()
let aptForm = new RailwayForm()

proffForm.fill("Proff", 777)
aptForm.fill("Apt", 6969)
proffForm.submit()
aptForm.submit()
aptForm.cancel()
