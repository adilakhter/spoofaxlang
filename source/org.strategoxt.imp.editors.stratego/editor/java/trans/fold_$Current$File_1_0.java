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

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4834)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail23412:
    { 
      IStrategoTerm u_4834 = null;
      IStrategoTerm w_4834 = null;
      w_4834 = term;
      Success12581:
      { 
        Fail23413:
        { 
          IStrategoTerm x_4834 = null;
          IStrategoTerm z_4834 = null;
          IStrategoTerm a_4835 = null;
          z_4834 = term;
          x_4834 = trans.const4473;
          a_4835 = z_4834;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4835, x_4834, trans.constCons2047);
          if(term == null)
            break Fail23413;
          if(true)
            break Success12581;
        }
        term = trans.constNil4;
      }
      u_4834 = term;
      term = w_4834;
      term = termFactory.makeTuple(u_4834, term);
      term = t_4834.invoke(context, term, lifted6977.instance);
      if(term == null)
        break Fail23412;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}