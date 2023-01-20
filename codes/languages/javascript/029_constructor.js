class RailwayForm{
	constructor(name, trainno){
		console.log("Constructor is called as soon as you create an object")
		this.name=name
		if (trainno == undefined){
			this.trainno="000000"
		}else{
			this.trainno=trainno
		}
	}
	// Useless after creation of constructor
	/*
		fill(givenname, trainno){
			this.name=givenname
			this.trainno=trainno
		}
	*/
	submit(){
		console.log(this.name+", Form submitted... for train no : "+this.trainno)
	}
	cancel(){
		console.log(this.name+", Form cancelled... for trian no : "+this.trainno)
	}
}

console.log("Before object creation")
// The constructor method is automaticall called by new keyword
let proffForm = new RailwayForm("Proff")
console.log("After object creation")
console.log("Before object creation")
let aptForm = new RailwayForm("Apt", 6969)
console.log("After object creation")

// proffForm.fill("Proff", 77777) 
// aptForm.fill("Apt", 6969)
proffForm.submit()
aptForm.submit()
aptForm.cancel()
