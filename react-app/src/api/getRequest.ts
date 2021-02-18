import axios from "./config";
import { getData } from "../localStorage/getData";

export const getRequest = async (endPoint: any, params?: any) => {
  const user = await getData("user");
  const token = user && user.uid ? user.token : "";
  const queryString = new URLSearchParams(params || {}).toString();
  return axios.get(endPoint + "?" + queryString, {
    headers: { authorization: "Bearer " + token },
  });
};
