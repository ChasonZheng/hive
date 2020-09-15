<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class HeartbeatTxnRangeRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'min',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'max',
            'isRequired' => true,
            'type' => TType::I64,
        ),
    );

    /**
     * @var int
     */
    public $min = null;
    /**
     * @var int
     */
    public $max = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['min'])) {
                $this->min = $vals['min'];
            }
            if (isset($vals['max'])) {
                $this->max = $vals['max'];
            }
        }
    }

    public function getName()
    {
        return 'HeartbeatTxnRangeRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->min);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->max);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('HeartbeatTxnRangeRequest');
        if ($this->min !== null) {
            $xfer += $output->writeFieldBegin('min', TType::I64, 1);
            $xfer += $output->writeI64($this->min);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->max !== null) {
            $xfer += $output->writeFieldBegin('max', TType::I64, 2);
            $xfer += $output->writeI64($this->max);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
