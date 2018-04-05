package com.kcci.emmi.donasmainview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class RegionFragment extends Fragment {
    HashMap<Integer, ArrayList<String>> map;
    ArrayAdapter<String> adapter2;
    ArrayList<String> dataList2;
    private LinearLayout regionView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_region, null);
//        View v = inflater.inflate(R.layout.fragment_map, container, false);
        regionView = v.findViewById(R.id.region);

        map = new HashMap<>();
        dataList2 = new ArrayList<>();
        dataList2.add("강남/역삼/삼성/논현");
        dataList2.add("서초/신사/방배");
        dataList2.add("잠실/신천");
        dataList2.add("천호/길동/둔촌");
        dataList2.add("구로/영등포/여의도/목동");
        dataList2.add("신림/서울대/사당/금천/동작");
        dataList2.add("강서/화곡/까치산/양천");
        dataList2.add("신촌/홍대/합정");
        dataList2.add("연신내/불광/응암");
        dataList2.add("종로/대학로");
        dataList2.add("성신여대/성북/월곡");
        dataList2.add("이태원/용산/서울역/명동/회현");
        dataList2.add("동대문/충무로/신당/약수/금호");
        dataList2.add("건대/군자/구의");
        dataList2.add("동묘/신설동/청량리/회기");
        dataList2.add("장안동/답십리");
        dataList2.add("수유/미아");
        dataList2.add("왕십리/성수");
        dataList2.add("상봉/중랑/면목");
        dataList2.add("태릉/노원/도봉/창동");
        map.put(0, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("수원/인계/권서/영통");
        dataList2.add("수원역/구운/장안/세류");
        dataList2.add("안양/평촌/인덕원/과천");
        dataList2.add("성남/분당/위례");
        dataList2.add("용인");
        dataList2.add("동탄/오산/병점");
        dataList2.add("하남/광주/여주/이천");
        dataList2.add("부천");
        dataList2.add("시흥/광명");
        dataList2.add("평택/송탄/화성/안성");
        dataList2.add("안산");
        dataList2.add("군포/의왕/금정/산본");
        dataList2.add("일산/고양");
        dataList2.add("김포/파주");
        dataList2.add("의정부");
        dataList2.add("구리/남양주");
        dataList2.add("가평/청평");
        dataList2.add("양평");
        dataList2.add("포천/양주/동두천/연천");
        dataList2.add("제부도/대부도");
        map.put(1, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("부평/동암");
        dataList2.add("서구/계양/동구");
        dataList2.add("구월");
        dataList2.add("주안");
        dataList2.add("송도/연수");
        dataList2.add("중구/인천공항/월미도/항동/강화/옹진");
        dataList2.add("간석/소래포구/만수");
        dataList2.add("용현/숭의/도화");
        map.put(2, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("춘천/강촌");
        dataList2.add("강릉/경포대/정동진/주문진");
        dataList2.add("원주");
        dataList2.add("영월/정선");
        dataList2.add("속초/양양/고성");
        dataList2.add("동해/삼척/태백");
        dataList2.add("평창");
        dataList2.add("송천/횡성");
        dataList2.add("화천/철원/인제/양구");
        map.put(3, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("제주시");
        dataList2.add("서귀포시");
        dataList2.add("하귀/애월/한림/협재");
        dataList2.add("조천/함덕/김녕/성산");
        map.put(4, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("유성구");
        dataList2.add("중구(은행/대흥/선화)");
        dataList2.add("동구(용전/복합터미널)");
        dataList2.add("서구(둔산/용문)");
        dataList2.add("대덕구(중리/신탄진)");
        map.put(5, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("청주 흥덕구/서원구(터미널/충북대)");
        dataList2.add("청주 상당구/청원구(북문로/청주대/용암/오창)");
        dataList2.add("충주/제천/진천/음성/단양");
        dataList2.add("보은/옥천/괴산/증평/영동");
        map.put(6, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("천안");
        dataList2.add("세종");
        dataList2.add("계룡/공주/금산/논산/청양");
        dataList2.add("아산/예산/홍성");
        dataList2.add("태안/안면도/서산/당진");
        dataList2.add("보령/대천/서천/부여");
        map.put(7, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("해운대/센텀시티/재송동");
        dataList2.add("송정/기장/정관");
        dataList2.add("광안리/경성대/대연/용호동/문현");
        dataList2.add("연산/토곡");
        dataList2.add("서면/양정/초읍/부산시민공원");
        dataList2.add("남포동/부산역/태종대/송도/범일동");
        dataList2.add("동래/사직/온천장/부산대/구서");
        dataList2.add("사상/엄궁/학장");
        dataList2.add("덕천/하단/구포/괴정/만덕/화명동/명지/녹산공단/김해공항");
        map.put(8, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("동구/북구/울주군(진하/일산/KTX역/등억리)");
        dataList2.add("남구/중구(삼산/성남/무거/시청)");
        map.put(9, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("창원");
        dataList2.add("마산/진해");
        dataList2.add("김해/장유");
        dataList2.add("양산/밀양");
        dataList2.add("진주/사천/남해");
        dataList2.add("거제/통영/고성");
        dataList2.add("거창/하동/함안/창녕/기타");
        map.put(10, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("동성로/서문시장/대구역/경북대/엑스코/칠곡지구/태전동");
        dataList2.add("동대구역/신천동/혁신도시/동촌유원지/대구공항/팔공산");
        dataList2.add("수성못/황금동/들안길/두산동/지산동");
        dataList2.add("북부정류장/평리동/비산동/대명동/봉덕동/안지랑");
        dataList2.add("두류공원/본리동/죽전동/성서/서부정류장/달성군");
        map.put(11, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("포항");
        dataList2.add("경주");
        dataList2.add("구미");
        dataList2.add("경산/영천/청도");
        dataList2.add("김천/칠곡/성주");
        dataList2.add("안동");
        dataList2.add("문경/상주/영주/예천/군위/의성/봉화");
        dataList2.add("울진/영덕/청송");
        dataList2.add("울릉도");
        map.put(12, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("상무지구/금호지구/유스퀘어/서구");
        dataList2.add("첨단지구/하남지구/송정역/광산구");
        dataList2.add("충장로/대인시장/국립아시아문화전당/동구/남구");
        dataList2.add("광주역/기아챔피언스필드/전대사거리/북구");
        map.put(13, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("여수");
        dataList2.add("순천/광양");
        dataList2.add("목포/무안/나주/영암/함평/영광");
        dataList2.add("해남/완도/진도/고흥/장흥/강진/신안/담양/화순/보성/곡성/구례/장성");
        map.put(14, dataList2);

        dataList2 = new ArrayList<>();
        dataList2.add("전주/완주");
        dataList2.add("군산");
        dataList2.add("익산");
        dataList2.add("남원/정읍/부안/김제/임실/장수/무주/고창/순창/진안");
        map.put(15, dataList2);


        ListView listView = (ListView) v.findViewById(R.id.list);
        String[] dataList = {
                "서울", "경기", "인천", "강원", "제주", "대전", "충북", "충남/세종", "부산", "울산", "경남",
                "대구", "경북", "광주", "전남", "전주/전북"
        };

        //http://recipes4dev.tistory.com/62
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);

        dataList2 = new ArrayList<>();
        ListView guList = (ListView) v.findViewById(R.id.list2);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataList2);
        guList.setAdapter(adapter2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<String> gu = map.get(position);
                adapter2.clear();
                adapter2.addAll(gu);
                adapter2.notifyDataSetChanged();
            }
        });

        return v;
    }
}
