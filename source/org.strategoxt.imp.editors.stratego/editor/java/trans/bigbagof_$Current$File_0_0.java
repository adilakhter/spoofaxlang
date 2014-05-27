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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail23418:
    { 
      TermReference z_4835 = new TermReference();
      if(z_4835.value == null)
        z_4835.value = term;
      else
        if(z_4835.value != term && !z_4835.value.match(term))
          break Fail23418;
      Success12584:
      { 
        Fail23419:
        { 
          IStrategoTerm c_4836 = null;
          IStrategoTerm e_4836 = null;
          IStrategoTerm f_4836 = null;
          e_4836 = term;
          c_4836 = trans.const4473;
          f_4836 = e_4836;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4836, c_4836, trans.constCons2047);
          if(term == null)
            break Fail23419;
          if(true)
            break Success12584;
        }
        term = trans.constNil4;
      }
      lifted6980 lifted69800 = new lifted6980();
      lifted69800.z_4835 = z_4835;
      term = filter_1_0.instance.invoke(context, term, lifted69800);
      if(term == null)
        break Fail23418;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}