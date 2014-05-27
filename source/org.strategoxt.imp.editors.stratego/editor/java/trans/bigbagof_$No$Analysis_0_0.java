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

@SuppressWarnings("all") public class bigbagof_$No$Analysis_0_0 extends Strategy 
{ 
  public static bigbagof_$No$Analysis_0_0 instance = new bigbagof_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_NoAnalysis_0_0");
    Fail23548:
    { 
      TermReference z_4857 = new TermReference();
      TermReference a_4858 = new TermReference();
      if(a_4858.value == null)
        a_4858.value = term;
      else
        if(a_4858.value != term && !a_4858.value.match(term))
          break Fail23548;
      if(z_4857.value == null)
        z_4857.value = term;
      else
        if(z_4857.value != term && !z_4857.value.match(term))
          break Fail23548;
      Success12619:
      { 
        Fail23549:
        { 
          IStrategoTerm d_4858 = null;
          IStrategoTerm f_4858 = null;
          IStrategoTerm g_4858 = null;
          f_4858 = term;
          d_4858 = trans.const4559;
          g_4858 = f_4858;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4858, d_4858, trans.constCons2047);
          if(term == null)
            break Fail23549;
          if(true)
            break Success12619;
        }
        term = trans.constNil4;
      }
      lifted7025 lifted70250 = new lifted7025();
      lifted70250.z_4857 = z_4857;
      lifted70250.a_4858 = a_4858;
      term = filter_1_0.instance.invoke(context, term, lifted70250);
      if(term == null)
        break Fail23548;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}