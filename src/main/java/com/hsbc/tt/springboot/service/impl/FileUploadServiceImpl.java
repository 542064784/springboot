package com.hsbc.tt.springboot.service.impl;

import com.hsbc.tt.springboot.service.api.FileUploadService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
/**
 * file upload service impl
 *
 * @author Damon Chen
 * @date 2018/08/19
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class FileUploadServiceImpl implements FileUploadService {
}
