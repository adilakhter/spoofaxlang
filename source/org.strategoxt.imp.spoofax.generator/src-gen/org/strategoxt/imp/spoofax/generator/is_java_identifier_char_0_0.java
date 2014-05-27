package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_java_identifier_char_0_0 extends Strategy 
{ 
  public static is_java_identifier_char_0_0 instance = new is_java_identifier_char_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_java_identifier_char_0_0");
    Fail25950:
    { 
      IStrategoTerm term10363 = term;
      Success10286:
      { 
        Fail25951:
        { 
          term = is_alphanum_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25951;
          if(true)
            break Success10286;
        }
        term = term10363;
        IStrategoTerm term10364 = term;
        Success10287:
        { 
          Fail25952:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 36 != ((IStrategoInt)term).intValue())
              break Fail25952;
            if(true)
              break Success10287;
          }
          term = term10364;
          if(term.getTermType() != IStrategoTerm.INT || 95 != ((IStrategoInt)term).intValue())
            break Fail25950;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}