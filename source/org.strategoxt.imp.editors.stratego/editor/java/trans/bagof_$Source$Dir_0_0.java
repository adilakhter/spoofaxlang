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

@SuppressWarnings("all") public class bagof_$Source$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Source$Dir_0_0 instance = new bagof_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_SourceDir_0_0");
    Fail21999:
    { 
      TermReference r_4291 = new TermReference();
      if(r_4291.value == null)
        r_4291.value = term;
      else
        if(r_4291.value != term && !r_4291.value.match(term))
          break Fail21999;
      Success11891:
      { 
        Fail22000:
        { 
          IStrategoTerm u_4291 = null;
          IStrategoTerm w_4291 = null;
          IStrategoTerm x_4291 = null;
          w_4291 = term;
          u_4291 = trans.const4342;
          x_4291 = w_4291;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4291, u_4291, trans.constCons1966);
          if(term == null)
            break Fail22000;
          if(true)
            break Success11891;
        }
        term = trans.constNil3;
      }
      lifted6730 lifted67300 = new lifted6730();
      lifted67300.r_4291 = r_4291;
      term = filter_1_0.instance.invoke(context, term, lifted67300);
      if(term == null)
        break Fail21999;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}