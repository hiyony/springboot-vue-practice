import axios from 'axios';

const CONNECT_URL = 'http://localhost:8765/vue/';

class DataService {
	getBirthday(inform){
		return axios
			.post(CONNECT_URL + 'getresult',{
				birthday: inform.birthday
			})
			.then(response => {
				if(response.data.accessToken){
					localStorage.setItem('inform', JSON.stringify(response.data));
				}
				return response.data;
			});
	}
	
	getHalfResult(inform){
		return axios
			.post(CONNECT_URL + 'half/view',{
				birthday: inform.birthday
			})
			.then(response => {
				if(response.data.accessToken){
					localStorage.setItem('inform', JSON.stringify(response.data));
				}
				return response.data;
			});
	}
	
	getPercentResult(inform){
		return axios
			.post(CONNECT_URL + 'percent/view',{
				birthday: inform.birthday
			})
			.then(response => {
				if(response.data.accessToken){
					localStorage.setItem('inform', JSON.stringify(response.data));
				}
				return response.data;
			});		
	}
}

export default new DataService();