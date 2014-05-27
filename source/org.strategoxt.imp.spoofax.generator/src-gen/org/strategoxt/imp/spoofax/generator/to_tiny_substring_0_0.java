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

@SuppressWarnings("all") public class to_tiny_substring_0_0 extends Strategy 
{ 
  public static to_tiny_substring_0_0 instance = new to_tiny_substring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("to_tiny_substring_0_0");
    Fail25558:
    { 
      IStrategoTerm term10099 = term;
      Success10076:
      { 
        Fail25559:
        { 
          IStrategoTerm f_4237 = null;
          IStrategoTerm h_4237 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail25559;
          f_4237 = ((IStrategoList)term).tail();
          term = f_4237;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25559;
          h_4237 = term;
          IStrategoList list377;
          list377 = checkListTail(h_4237);
          if(list377 == null)
            break Fail25559;
          term = generator.const7074;
          if(true)
            break Success10076;
        }
        term = term10099;
        IStrategoTerm term10100 = term;
        Success10077:
        { 
          Fail25560:
          { 
            term = $Hd_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25560;
            term = generator.const7075;
            if(true)
              break Success10077;
          }
          term = term10100;
          IStrategoTerm term10101 = term;
          Success10078:
          { 
            Fail25561:
            { 
              term = $Fst_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25561;
              term = generator.const7076;
              if(true)
                break Success10078;
            }
            term = term10101;
            IStrategoTerm term10102 = term;
            Success10079:
            { 
              Fail25562:
              { 
                term = _0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25562;
                term = generator.const7077;
                if(true)
                  break Success10079;
              }
              term = term10102;
              IStrategoTerm term10103 = term;
              Success10080:
              { 
                Fail25563:
                { 
                  if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                    break Fail25563;
                  term = generator.const7078;
                  if(true)
                    break Success10080;
                }
                term = term10103;
                IStrategoTerm j_4237 = null;
                term = strip_annos_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25558;
                IStrategoTerm cons316 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
                j_4237 = cons316;
                term = j_4237;
                IStrategoTerm term10104 = term;
                Success10081:
                { 
                  Fail25564:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25564;
                    if(true)
                      break Success10081;
                  }
                  term = write_to_string_0_0.instance.invoke(context, term10104);
                  if(term == null)
                    break Fail25558;
                }
              }
            }
          }
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