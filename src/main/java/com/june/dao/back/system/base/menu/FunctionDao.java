/**
 * 中科方德软件有限公司<br>
 * june_web_new:com.june.dao.back.system.base.menu.FunctionDao.java
 * 日期:2017年2月17日
 */
package com.june.dao.back.system.base.menu;

import com.june.common.BaseDao;
import com.june.dto.back.system.base.FunctionDto;

/**
 * FunctionDao <br>
 * 
 * @author 王俊伟 wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017年2月17日 下午5:08:22
 * @version 1.0.0
 */
public interface FunctionDao extends BaseDao<FunctionDto> {

	/**
	 * 根据按钮id删除与角色关联的按钮信息
	 * @param id 按钮id
	 * @date 2017年2月22日 下午6:27:04
	 * @writer junehappylove
	 */
	void deleteByBtnId(String id);
}
