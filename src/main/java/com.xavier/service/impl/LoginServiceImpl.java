package com.xavier.service.impl;

import com.xavier.common.Dialog;
import com.xavier.model.ConnectionInfo;
import com.xavier.service.LoginService;
import javafx.scene.control.Alert;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(String host, String account, String password, String port) {
		try {
			if (!StringUtils.isEmpty(host) && !StringUtils.isEmpty(account) && !StringUtils.isEmpty(port)) {
				int portValue = Integer.parseInt(port);
				System.out.println(new ConnectionInfo(host, account, password, portValue));
			} else {
				StringBuffer msg = new StringBuffer("");
				if (StringUtils.isEmpty(host)) {
					msg.append("地址 ");
				}
				if (StringUtils.isEmpty(account)) {
					msg.append("账号 ");
				}
				if (StringUtils.isEmpty(port)) {
					msg.append("端口 ");
				}
				msg.append("不能为空");
				Dialog.alert(msg.toString(), Alert.AlertType.ERROR);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
