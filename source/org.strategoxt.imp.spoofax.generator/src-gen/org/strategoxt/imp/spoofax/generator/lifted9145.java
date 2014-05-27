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

@SuppressWarnings("all") final class lifted9145 extends Strategy 
{ 
  public static final lifted9145 instance = new lifted9145();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28894:
    { 
      TermReference f_4240 = new TermReference();
      IStrategoTerm g_4240 = null;
      if(f_4240.value == null)
        f_4240.value = term;
      else
        if(f_4240.value != term && !f_4240.value.match(term))
          break Fail28894;
      IStrategoTerm term10111 = term;
      Success11400:
      { 
        Fail28895:
        { 
          term = listinj2prodrule_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28895;
          if(true)
            break Success11400;
        }
        term = term10111;
        IStrategoTerm term10112 = term;
        Success11401:
        { 
          Fail28896:
          { 
            term = seq2prodrule_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28896;
            if(true)
              break Success11401;
          }
          term = term10112;
          IStrategoTerm term10113 = term;
          Success11402:
          { 
            Fail28897:
            { 
              term = alt2prodrule_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28897;
              if(true)
                break Success11402;
            }
            term = term10113;
            IStrategoTerm term10114 = term;
            Success11403:
            { 
              Fail28898:
              { 
                term = var2prodrule_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28898;
                if(true)
                  break Success11403;
              }
              term = term10114;
              IStrategoTerm term10115 = term;
              Success11404:
              { 
                Fail28899:
                { 
                  term = opt2prodrule_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28899;
                  if(true)
                    break Success11404;
                }
                term = term10115;
                IStrategoTerm term10116 = term;
                Success11405:
                { 
                  Fail28900:
                  { 
                    term = inj2prodrule_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail28900;
                    if(true)
                      break Success11405;
                  }
                  term = term10116;
                  IStrategoTerm term10117 = term;
                  Success11406:
                  { 
                    Fail28901:
                    { 
                      term = prod2prodrule_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail28901;
                      if(true)
                        break Success11406;
                    }
                    term = term10117;
                    IStrategoTerm i_4240 = null;
                    i_4240 = term;
                    term = fatal_err_0_1.instance.invoke(context, i_4240, generator.const7105);
                    if(term == null)
                      break Fail28894;
                    if(true)
                      break Fail28894;
                  }
                }
              }
            }
          }
        }
      }
      g_4240 = term;
      lifted9146 lifted91460 = new lifted9146();
      lifted91460.f_4240 = f_4240;
      term = try_1_0.instance.invoke(context, term, lifted91460);
      if(term == null)
        break Fail28894;
      term = g_4240;
      if(true)
        return term;
    }
    return null;
  }
}