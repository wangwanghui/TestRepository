package cn.web.demo.control;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orderNew")
@RestController
public class OrderController {
    @ApiOperation(value = "获取某条订单信息")
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    public String getOrder(@ApiParam(value = "订单编号", required = true) @RequestParam(value = "orderNo") String orderNo,
                           @ApiParam(value = "当前页") @RequestParam(value = "pageNum", required = false) Integer pageNum,
                           @ApiParam(value = "每页显示数量") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        return "成功！";
    }


    /**
     * 查询用户列表
     * @return
     */

}