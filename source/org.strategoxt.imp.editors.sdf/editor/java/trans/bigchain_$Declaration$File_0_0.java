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

@SuppressWarnings("all") public class bigchain_$Declaration$File_0_0 extends Strategy 
{ 
  public static bigchain_$Declaration$File_0_0 instance = new bigchain_$Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DeclarationFile_0_0");
    Fail76255:
    { 
      IStrategoTerm h_92100 = null;
      IStrategoTerm k_92100 = null;
      IStrategoTerm m_92100 = null;
      h_92100 = term;
      m_92100 = term;
      Success41843:
      { 
        Fail76256:
        { 
          IStrategoTerm o_92100 = null;
          o_92100 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_92100, trans.const15524, h_92100);
          if(term == null)
            break Fail76256;
          if(true)
            break Success41843;
        }
        term = trans.constNil11;
      }
      k_92100 = term;
      term = m_92100;
      term = termFactory.makeTuple(k_92100, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21634.instance);
      if(term == null)
        break Fail76255;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}