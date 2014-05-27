package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4836)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail23421:
    { 
      TermReference r_4836 = new TermReference();
      if(r_4836.value == null)
        r_4836.value = term;
      else
        if(r_4836.value != term && !r_4836.value.match(term))
          break Fail23421;
      Success12585:
      { 
        Fail23422:
        { 
          IStrategoTerm v_4836 = null;
          IStrategoTerm x_4836 = null;
          IStrategoTerm y_4836 = null;
          x_4836 = term;
          v_4836 = trans.const4473;
          y_4836 = x_4836;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4836, v_4836, trans.constCons2047);
          if(term == null)
            break Fail23422;
          if(true)
            break Success12585;
        }
        term = trans.constNil4;
      }
      lifted6982 lifted69820 = new lifted6982();
      lifted69820.r_4836 = r_4836;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted69820, t_4836);
      if(term == null)
        break Fail23421;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}