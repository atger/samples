import axios from 'axios';
export const BASE_URL = "http://localhost:8080/api";
export const LOGIN = "/login";
export const SIGNUP = "/signup";
export default axios.create({
    baseURL: BASE_URL,
});
  