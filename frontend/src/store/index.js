import Vue from 'vue'
import Vuex from 'vuex'
import DataService from '../service/data.service';

Vue.use(Vuex)

const inform = JSON.parse(localStorage.getItem('inform'));
const initialState = inform
	?{status: {getBday: true}, inform}
	:{status: {getBday: false}, user:null};
	
const state = {
	initialState
}

const mutations = {
	getBirthdaySuccess(state, inform){
		state.initialState.status.getBday = true;
		state.initialState.inform = inform;
	},
	getBirthdayFailure(state){
		state.initialState.status.getBday = false;
		state.initialState.inform = null;
	},
	getHalfResultSuccess(state, inform){
		state.initialState.status.getBday = true;
		state.initialState.inform = inform;
	},
	getHalfResultFailure(state){
		state.initialState.status.getBday = false;
		state.initialState.inform = null;
	},
	getPercentResultSuccess(state, inform){
		state.initialState.status.getBday = true;
		state.initialState.inform = inform;
	},
	getPercentResultFailure(state){
		state.initialState.status.getBday = false;
		state.initialState.inform = null;
	}
}

const actions = {
	
	getBirthday({commit}, inform){
		return DataService.getBirthday(inform).then(
			inform => {
				commit('getBirthdaySuccess', inform);
				return Promise.resolve(inform);
			},
			error => {
				commit('getBirthdayFailure');
				return Promise.reject(error);
			}
		);
	},
	getHalfResult({commit}, inform){
		return DataService.getHalfResult(inform).then(
			inform => {
				commit('getHalfResultSuccess', inform);
				return Promise.resolve(inform);
			},
			error => {
				commit('getHalfResultFailure');
				return Promise.reject(error);
			}
		);
	},
	getPercentResult({commit}, inform){
		return DataService.getPercentResult(inform).then(
			inform => {
				commit('getPercentResultSuccess', inform);
				return Promise.resolve(inform);
			},
			error => {
				commit('getPercentResultFailure');
				return Promise.reject(error);
			}
		);
	}
}

const store = new Vuex.Store({
	strict: true,
	mutations,
	state,
	actions
})

export default store






