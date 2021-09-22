import {ICustomer} from "./ICustomer";

export interface ISoTietKiem{
  id: number,
  ngayMoSo: String,
  thoiGianBatDau: String,
  kyHan: String,
  soTienGoi: String,
  laiSuat: String,
  uuDai: String,
  customer: ICustomer
}
