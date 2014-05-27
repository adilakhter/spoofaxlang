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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail23423:
    { 
      TermReference z_4836 = new TermReference();
      if(z_4836.value == null)
        z_4836.value = term;
      else
        if(z_4836.value != term && !z_4836.value.match(term))
          break Fail23423;
      Success12586:
      { 
        Fail23424:
        { 
          IStrategoTerm c_4837 = null;
          IStrategoTerm e_4837 = null;
          IStrategoTerm f_4837 = null;
          e_4837 = term;
          c_4837 = trans.const4473;
          f_4837 = e_4837;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4837, c_4837, trans.constCons2047);
          if(term == null)
            break Fail23424;
          if(true)
            break Success12586;
        }
        term = trans.constNil4;
      }
      lifted6983 lifted69830 = new lifted6983();
      lifted69830.z_4836 = z_4836;
      term = filter_1_0.instance.invoke(context, term, lifted69830);
      if(term == null)
        break Fail23423;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}