export default{
	validate(key, val){
		const errors = []
		
		if(!val){
			errors.push(`${key} field is required`)
		} else {
			if(val.length < 7){
				errors.push(`{$key} filed should have length of 7`)
			}
		}
		return errors
	}
}