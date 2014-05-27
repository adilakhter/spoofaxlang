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

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail23414:
    { 
      IStrategoTerm f_4835 = null;
      IStrategoTerm h_4835 = null;
      h_4835 = term;
      Success12582:
      { 
        Fail23415:
        { 
          IStrategoTerm i_4835 = null;
          IStrategoTerm k_4835 = null;
          IStrategoTerm l_4835 = null;
          k_4835 = term;
          i_4835 = trans.const4473;
          l_4835 = k_4835;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, l_4835, i_4835, trans.constCons2047);
          if(term == null)
            break Fail23415;
          if(true)
            break Success12582;
        }
        term = trans.constNil4;
      }
      f_4835 = term;
      term = h_4835;
      term = termFactory.makeTuple(f_4835, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6978.instance);
      if(term == null)
        break Fail23414;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}