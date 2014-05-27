package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_92080)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail76132:
    { 
      TermReference c_92080 = new TermReference();
      if(c_92080.value == null)
        c_92080.value = term;
      else
        if(c_92080.value != term && !c_92080.value.match(term))
          break Fail76132;
      Success41811:
      { 
        Fail76133:
        { 
          IStrategoTerm g_92080 = null;
          IStrategoTerm i_92080 = null;
          IStrategoTerm j_92080 = null;
          i_92080 = term;
          g_92080 = trans.const15448;
          j_92080 = i_92080;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_92080, g_92080, trans.constCons7205);
          if(term == null)
            break Fail76133;
          if(true)
            break Success41811;
        }
        term = trans.constNil11;
      }
      lifted21593 lifted215930 = new lifted21593();
      lifted215930.c_92080 = c_92080;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted215930, e_92080);
      if(term == null)
        break Fail76132;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}